# GitHub Actions - compiling and running the code

Config (file `.github/workflows/vanilla-java.yml`).

```
name: CI

on:
  push:
    branches: [ main ]
  workflow_dispatch:

jobs:
  build:
    runs-on: ubuntu-latest
    steps:
      - uses: actions/checkout@v2
      - uses: actions/setup-java@v1
        with:
          java-version: '13' # The JDK version to make available on the path.
      - run: javac Sandbox.java; java Sandbox;
```
