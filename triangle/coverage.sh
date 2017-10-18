#!/bin/sh

MAJOR_HOME="lib/major"

ant clean compile
$MAJOR_HOME/bin/ant coverage
