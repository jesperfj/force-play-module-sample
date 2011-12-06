# Sample app for Force.com Play! module

This is a sample app to test out and work on the [Force.com Play! module](https://github.com/jesperfj/force-play-module).

## Usage

Clone this app and pull in the Force.com play module as a git submodule:

    $ git clone --recursive git@github.com:jesperfj/force-play-module-sample.git

Build the submodule

    $ cd force-play-module-sample/force
    $ play deps && play build-module

Build dependencies for the sample

    $ cd ..
    $ play deps

Configure a new remote access application in Force.com. See the [README](https://github.com/jesperfj/force-rest-api) in the Force.com REST API repo for details.

Set up oauth config

    $ export CLIENT_ID="..."
    $ export CLIENT_SECRET="..."
    $ export APP_URI="http://localhost:9000"

`APP_URI` is necessary to determine redirect URI. You must set redirect URI in remote access config to `http://localhost:9000/_auth`

Test it out

    $ play run

Hit <http://localhost:9000> and see what happens.

