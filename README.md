
# ruby-runtime Plugin
[![Jenkins Plugin](https://img.shields.io/jenkins/plugin/v/ruby-runtime.svg)](https://plugins.jenkins.io/ruby-runtime)
[![Popularity](https://img.shields.io/jenkins/plugin/i/ruby-runtime.svg)](https://plugins.jenkins.io/ruby-runtime)
[![GitHub release](https://img.shields.io/github/release/jenkinsci/ruby-runtime.svg?label=changelog)](https://github.com/jenkinsci/ruby-runtime-plugin/releases)

**This plugin is up for adoption.** Want to help improve this plugin?
[Click here to learn
more](https://wiki.jenkins.io/display/JENKINS/Adopt+a+Plugin "Adopt a Plugin")!

Provides the Ruby runtime and bindings required to implement [plugins in
Ruby](https://wiki.jenkins.io/display/JENKINS/Jenkins+plugin+development+in+Ruby).

# About the plugin
1. switch to JRuby
    $ rvm jruby
2. build the plugin with maven
    $ mvn install

If ./src/main/resources/ruby/vendor directory doesn't exist, Maven will run "bundle install".
But otherwise it'll skip it for efficiency.

# Release Notes
See [Github Releases](https://github.com/jenkinsci/ruby-runtime-plugin/releases)

# History
### Version 0.13 (Aug 11, 2016)
-   Changes
    -   Require Jenkins 1.609.1 or above
    -   Depends on JRuby 1.7.18
        -   Should fix
            [JENKINS-12094](https://issues.jenkins-ci.org/browse/JENKINS-12094)
            and
            [JENKINS-23071](https://issues.jenkins-ci.org/browse/JENKINS-23071)

