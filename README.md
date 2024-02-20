# Java Grimoire

## a book of Java (programming) magic

The repository is based on the [devcontainerJavaGUIWM](https://github.com/WalterMarch/devcontainerJavaGUIWM) template repo and is a part of the larger [Grimoire Programmatica](https://github.com/WalterMarch/grimoireprogrammatica) project.

Since I'm teaching myself Java, these files will be simple and perhaps not strictly follow best practices (since I may not actually know them).

### The code

* [String](./String/) - checking out String-related methods.
* [SwingHello](./SwingHello/) - a very simple `javax.swing.JOptionPane` example.

## miscellany

`configit.sh` looks like this:

```bash
#!/bin/bash

git config --global user.email "yourEmail@mail.com"
git config --global user.name "yourGitUserName"
git config --global push.autoSetupRemote true

git config --global --add safe.directory $1
```
