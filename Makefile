# make clean remove all files with the .o extension
.PHONY: clean
clean:
	rm -f *.o

# make install install the redocly cli
.PHONY: install
install:
	cp .githooks/* .git/hooks/
	chmod u+x .git/hooks/*
	npm install @redocly/cli -g

# make redocbuild build the redoc documentation
redocbuild:
	pwd
	redocly build-docs ./docs/api/openapi.yaml --output=./docs/api/document/index.html
	redocly build-docs ./docs/api/openapi2.yaml --output=./docs/api/document/index-internal.html
