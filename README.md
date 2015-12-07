Cypher Intellij Plugin
======================
[![HuBoard task board for this project](https://img.shields.io/badge/Hu-Board-7965cc.svg)](https://huboard.com/FylmTM/intellij-plugin-cypher)

Plugin provides [Cypher](http://www.opencypher.org/) query language support for Jetbrains IDE family.

**WARNING:** Currently plugin is in alpha-stage. If any bugs, incompatibilities or other issues occurs - report
by creating issue on Github.

# Features

* Cypher query highlight in `.cyp` files
* Cypher language injection into strings (Java, PHP and others)
* Parser errors for invalid Cypher queries

# Supported Jetbrains products

* IntelliJ IDEA - **tested**.
* RubyMine
* WebStorm
* PhpStorm
* PyCharm
* AppCode
* Android Studio
* 0xDBE
* CLion

Plugin is not tested (yet) with all existing Jetbrains products. However it should work
without any issues.

# Installation

Plugin should be available via Jetbrains repositories somewhere in near future.

### Manual

1. Navigate to [releases](https://github.com/FylmTM/intellij-plugin-cypher/releases) page.
2. Pick most recent release.
3. Download `Cypher.zip` file.
4. Go to your Intellij IDE preferences `Plugins` -> `Install plugin from disk...`.
5. Select downloaded plugin.
6. Restart IDE.

# Known issues

* Using keyword or function name as identifier will break lexer.
* Error description is not really usable (internal naming).

# Roadmap

1. Stabilize grammar.
2. Make parser errors readable.
3. Code completion.
4. References (find usages/renaming/etc).
5. Grammar error recovery tuning.

# Screenshots

![cypher_syntax_highlight](screenshots/cypher_syntax_highlight.png)

# Development

Gradle is used as build system. 

```shell
# Build plugin distribution
./gradlew buildPlugin 

# Run idea in development mode
./gradlew runIdea
```

### Grammar

Cypher grammar is located here - `src/main/java/com/neueda4j/intellij/plugin/cypher/lexer/Cypher.bnf`

After grammar change:

* Generate parser code for grammar
* Generate jFlex `.lexer` for grammar
* Generate lexer code from `.lexer`

# License

Copyright © 2015 Dmitry Vrublevsky

Released under the Apache 2.0 License.

