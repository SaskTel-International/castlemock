/*
 * Copyright 2015 Karl Dahlgren
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.fortmocks.mock.rest.model.project.processor;

import com.fortmocks.core.model.Processor;
import com.fortmocks.core.model.Result;
import com.fortmocks.core.model.Task;
import com.fortmocks.mock.rest.model.project.domain.RestMethod;
import com.fortmocks.mock.rest.model.project.dto.RestMethodDto;
import com.fortmocks.mock.rest.model.project.processor.message.input.UpdateRestMethodInput;
import com.fortmocks.mock.rest.model.project.processor.message.output.UpdateRestMethodOutput;
import org.springframework.stereotype.Service;

/**
 * @author Karl Dahlgren
 * @since 1.0
 */
@Service
public class UpdateRestMethodProcessor extends AbstractRestProjectProcessor implements Processor<UpdateRestMethodInput, UpdateRestMethodOutput> {

    /**
     * The process message is responsible for processing an incoming task and generate
     * a response based on the incoming task input
     * @param task The task that will be processed by the processor
     * @return A result based on the processed incoming task
     * @see Task
     * @see Result
     */
    @Override
    public Result<UpdateRestMethodOutput> process(final Task<UpdateRestMethodInput> task) {
        final UpdateRestMethodInput input = task.getInput();
        final RestMethodDto updatedRestMethod = input.getRestMethod();
        final RestMethod restMethod = findRestMethodType(input.getRestProjectId(), input.getRestApplicationId(), input.getRestResourceId(), input.getRestMethodId());
        restMethod.setName(updatedRestMethod.getName());
        restMethod.setRestMethodType(updatedRestMethod.getRestMethodType());
        restMethod.setRestResponseStrategy(updatedRestMethod.getRestResponseStrategy());
        restMethod.setRestMethodStatus(updatedRestMethod.getRestMethodStatus());
        restMethod.setForwardedEndpoint(updatedRestMethod.getForwardedEndpoint());
        save(input.getRestProjectId());
        return createResult(new UpdateRestMethodOutput());
    }
}
