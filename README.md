# inspiringsolutions-tooling

[![Build status at https://travis-ci.org/wojtek132/inspiring-tooling](https://travis-ci.org/wojtek132/inspiring-tooling.svg)](https://travis-ci.org/wojtek132/inspiring-tooling)

## What is this

Sample project used for workshops during Inspiring Solutions conference

The websocket location is ws://peaceful-ridge-14628.herokuapp.com/channel/{keyword}

## How to build

- make sure you have recent Java 8 installed (Oracle or OpenJDK)
- make sure you have `node` in version >= `4.2.x`
    - On unices you could try:
        - `rm -rf ~/.nvm`
        - `curl -L https://raw.githubusercontent.com/creationix/nvm/master/install.sh | sh`
        - `source ~/.nvm/nvm.sh`
        - `nvm install 4.2.2`
        - `nvm use 4.2.2`
    - On Win try maybe: https://github.com/coreybutler/nvm-windows
- run `npm install`
- run `./activator compile run`
- go to `localhost:9000`
