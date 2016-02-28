<p align="center"><img src="http://fortmocks.com/images/fm-logo-small.png"></div></p>

# Fort Mocks: Mock RESTful APIs and SOAP web services

[![][travis img]][travis]
[![][codecov img]][codecov]
[![][release img]][release]
[![][license img]][license]
[![][docker stars img]][docker stars]
[![][docker pulls img]][docker pulls]

## About

Fort Mocks is a web application that provides the functionality to mock out RESTful APIs and SOAP web services. This functionality allows client-side developers to completely mimic a server side behaviour and shape the responses themselves.

Fort Mocks enables you to upload both WSDL or WADL files. The web services defined within the files will be mocked automatically by Fort Mocks. Once the mocks for the web services are created, they can be configured to mock the service or forward the request to the original endpoint. The response from the forwarded requests can be recorded automatically and used to create new mocked responses.

Fort Mocks is completely free and open source (Apache License). It is built with Java and the application itself is deployed to an Apache Tomcat server.

## Downloads

Non-source downloads such as WAR files can be found on our website: [http://www.fortmocks.com/](http://www.fortmocks.com/).

## Usage

Fort Mocks can be downloaded as Java Web Archive (.war) file and be deployed on a Apache Tomcat server (Apache Tomcat 7.0 or higher). Fort Mocks can also be deployed by using Docker. For more information go to the offical Fort Mocks Docker page: [https://hub.docker.com/r/fortmocks/fortmocks/](https://hub.docker.com/r/fortmocks/fortmocks/). 

Upon successful installation and deployment, Fort Mocks can be accessed from the web browser:

    http://localhost:8080/fortmocks
    
This will prompt you the login screen. When logging for the first time use the following credentials: 

    Username: admin 
    Password: admin 

It is recommended that the administrator profile gets updated with a more secure password. This is accomplish by going to the user page and choosing to update the profile.

Upon successful login, you will be able to create both SOAP and REST projects. SOAP and REST resources can either be created manually or created by importing resource descriptions, such as WSDL and WADL. All created resources can be mocked multiple times. Each resource can also be configured to have different response strategies, such as random and sequence

## Source

Our latest and greatest source of Fort Mocks can be found on [GitHub](https://github.com/fortmocks/fortmocks/).

## Full Documentation

Full documentation will be provided shortly.

## Communication
- Website: [http://www.fortmocks.com/](http://www.fortmocks.com/)
- Google Group: [FortMocks](http://groups.google.com/d/forum/fortmocks)
- Twitter: [@FortMocks](http://twitter.com/FortMocks)
- [GitHub Issues](https://github.com/fortmocks/fortmocks/issues)
- [Docker](https://hub.docker.com/r/fortmocks/fortmocks/)

## Bugs and Feedback

For bugs, questions and discussions please use the [GitHub Issues](https://github.com/fortmocks/fortmocks/issues)

## Continuous integration

Fort Mocks' continuous integration environment is publicly available and can be access on the following link: [Travis CI](https://travis-ci.org/fortmocks/fortmocks)

## News and Website

All information about Fort Mocks can be found on our website. Follow us on Twitter: [FortMocks](http://twitter.com/FortMocks).

## License

Fort Mocks is **licensed** under the **[Apache License](https://github.com/fortmocks/fortmocks/blob/master/LICENSE)**. The terms of the license are as follows:

    Apache License

    Copyright 2015 Karl Dahlgren and a number of other contributors.

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

[travis]:https://travis-ci.org/fortmocks/fortmocks
[travis img]:https://travis-ci.org/fortmocks/fortmocks.svg?branch=develop

[release]:https://github.com/fortmocks/fortmocks/releases
[release img]:https://img.shields.io/github/release/fortmocks/fortmocks.svg

[license]:LICENSE
[license img]:https://img.shields.io/badge/license-Apache%202-blue.svg

[codecov]:https://codecov.io/github/fortmocks/fortmocks
[codecov img]:https://img.shields.io/codecov/c/github/fortmocks/fortmocks/develop.svg

[docker stars]:https://hub.docker.com/r/fortmocks/fortmocks/
[docker stars img]:https://img.shields.io/docker/stars/fortmocks/fortmocks.svg

[docker pulls]:https://hub.docker.com/r/fortmocks/fortmocks/
[docker pulls img]:https://img.shields.io/docker/pulls/fortmocks/fortmocks.svg
