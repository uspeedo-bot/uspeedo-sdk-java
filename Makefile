JAVA_FILES=$$(find ./ -name "*.java")

.PHONY: help
help:
	@echo "build Artifact build script"
	@echo "test-cov Unit test coverage baseline"
	@echo "fmt format"

.PHONY: build
build:
	mvn clean package -DskipTests=true

.PHONY: fmt
fmt:
	google-java-format --aosp -r ${JAVA_FILES}

.PHONY: lint
lint:
	echo "skipped"

.PHONY: test-cov
test-cov:
	mvn test

.PHONY: dev
dev:
	mkdir -p cache
	curl -sLo ./cache/google-java-format-1.7-all-deps.jar https://github.com/google/google-java-format/releases/download/google-java-format-1.7/google-java-format-1.7-all-deps.jar

.PHONY: install
install:
	mvn clean install -DskipTests=true
