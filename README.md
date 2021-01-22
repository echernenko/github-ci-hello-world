# GitHub Actions test for hello world Java project

Config (file `.github/workflows/maven.yml`)

```
name: Master Branch

on:
  push:
    branches-ignore:
      - 'release*'

jobs:

  test:
    name: Unit Test
    runs-on: ubuntu-18.04

    steps:
      - uses: actions/checkout@v1
      - name: Set up JDK 11
        uses: actions/setup-java@v1
        with:
          java-version: 1.11
      - name: Maven Test
        run: mvn test
```
