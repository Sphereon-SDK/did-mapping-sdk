# DID Mapping SDK
The DID Mapping microservice stores a mapping from a `userId` and `applicationId` to a DID for services that want to authenticate using DID-auth.

## Java 11
Under `java11-native/` you can find the generated SDK for use with Java 11. At this moment, this is the only language that this SDK generator has been configured for. In order to configure further language support, the `pom.xml` would need to be edited to include a new profile with the appropriate `openapi-generator-maven-plugin` configuration.

To regenerate this sdk based on a new `swagger.sdk.json`, simply overwrite the existing JSON and run:
```bash
rm -rf java11-native/ 
mvn -Pjava11-native clean compile
``` 
To install the SDK to your local Maven repository, use:
```bash
cd java11-native/
mvn clean install
```
#### Tests
If an SDK is regenerated from the `swagger.sdk.json`, the generated SDK will not have working tests, but rather a skeleton for tests that must be written. For example, in `java11-native/` the test skeletons can be found under `java11-native/src/test/java/com/sphereon/sdk/did/mapping/`

#### SDK Usage
For instructions on the SDK usage, please consult the README under the respective language directory. For Java 11 `java11-native/README.md`