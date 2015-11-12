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

package com.fortmocks.mock.rest.model.project.processor.message.output;

import com.fortmocks.core.model.Output;
import com.fortmocks.core.model.validation.NotNull;
import com.fortmocks.mock.rest.model.project.dto.RestApplicationDto;
import com.fortmocks.mock.rest.model.project.dto.RestProjectDto;

/**
 * @author Karl Dahlgren
 * @since 1.0
 */
public class UpdateRestApplicationOutput implements Output {

    @NotNull
    private RestApplicationDto updatedRestApplication;

    public RestApplicationDto getUpdatedRestApplication() {
        return updatedRestApplication;
    }

    public void setUpdatedRestApplication(RestApplicationDto updatedRestApplication) {
        this.updatedRestApplication = updatedRestApplication;
    }
}
