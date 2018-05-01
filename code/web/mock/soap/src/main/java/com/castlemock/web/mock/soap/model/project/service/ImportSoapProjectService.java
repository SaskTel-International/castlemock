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

package com.castlemock.web.mock.soap.model.project.service;

import com.castlemock.core.basis.model.Service;
import com.castlemock.core.basis.model.ServiceResult;
import com.castlemock.core.basis.model.ServiceTask;
import com.castlemock.core.mock.soap.model.project.domain.SoapProject;
import com.castlemock.core.mock.soap.model.project.service.message.input.ImportSoapProjectInput;
import com.castlemock.core.mock.soap.model.project.service.message.output.ImportSoapProjectOutput;
import com.castlemock.web.mock.soap.legacy.repository.project.v1.SoapProjectV1LegacyRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Karl Dahlgren
 * @since 1.0
 */
@org.springframework.stereotype.Service
public class ImportSoapProjectService extends AbstractSoapProjectService implements Service<ImportSoapProjectInput, ImportSoapProjectOutput> {

    @Autowired
    private SoapProjectV1LegacyRepository legacyRepository;


    /**
     * The process message is responsible for processing an incoming serviceTask and generate
     * a response based on the incoming serviceTask input
     * @param serviceTask The serviceTask that will be processed by the service
     * @return A result based on the processed incoming serviceTask
     * @see ServiceTask
     * @see ServiceResult
     */
    @Override
    public ServiceResult<ImportSoapProjectOutput> process(final ServiceTask<ImportSoapProjectInput> serviceTask) {
        final ImportSoapProjectInput input = serviceTask.getInput();

        // Try to import the project as a legacy project first.
        SoapProject project = this.legacyRepository.importOne(input.getProjectRaw());

        if(project == null){
            // Unable to load the project as a legacy project.
            project = repository.importOne(input.getProjectRaw());
        }

        return createServiceResult(new ImportSoapProjectOutput(project));
    }
}
