package dictionary.cli;

import picocli.CommandLine;

import dictionary.cli.commands.DictionaryCommand;

public class Main {
    public static void main(final String[] args) {
        final CommandLine commandLine = new CommandLine(new DictionaryCommand());
        System.exit(commandLine.execute(args));
    }
}
