package com.holmsted.gerrit.anonymizer;

import com.holmsted.RandomLists;

public class FakeCommitTitleGenerator {

    public static String[] ACTIONS = {
            "Add",
            "Implement",
            "Create",
            "Change",
            "Fix",
            "Improve",
            "Work around",
            "Tune",
            "Adjust",
            "Validate",
            "Import",
            "Introduce",
            "Re-introduce",
            "WIP:",
            "Document",
            "Make",
            "Merge",
            "Resolve",
            "Copypaste",
            "Fix review comments on"
    };

    public static String[] NEGATIVE_ADJECTIVES = {
            "terrible",
            "horrible",
            "awful",
            "disfunctional",
            "hacky",
            "chaotic",
            "spaghetti-like",
            "bad",
            "depressing",
    };

    public static String[] POSITIVE_ADJECTIVES = {
            "awesome",
            "robust",
            "wonderful",
            "cool",
            "pro",
            "leet",
            "great",
            "snappy",
            "artistic",
            "unlimited",
            "accelerated",
            "handy",
            "helpful",
            "humongous",
            "revered",
            "rich",
            "timely",
            "tenacious",
            "defiant"
    };

    public static String[] NOUNS = {
            "menu",
            "context menu",
            "generator",
            "factory",
            "model",
            "exception handler",
            "threading support",
            "memory model",
            "output parser",
            "parser",
            "frontend",
            "component",
            "UI widgets",
            "aggregator",
            "widget",
            "reverse domain resolver",
            "resolver",
            "utility",
            "command-line tools",
            "tools",
            "utilities",
            "documentation",
            "StackOverflow copypaster",
            "hack",
            "incubator",
            "social network",
            "3d moustache modeler",
            "video sharing protocol",
            "flight information sharing",
            "supply chain aggregator",
            "game theory planner",
            "big data pipeline"
    };

    public static String generate() {
        StringBuilder builder = new StringBuilder();

        builder.append(RandomLists.randomItemFrom(ACTIONS)).append(' ');
        if (Math.random() > 0.5) {
            builder.append(RandomLists.randomItemFrom(POSITIVE_ADJECTIVES));
        } else {
            builder.append(RandomLists.randomItemFrom(NEGATIVE_ADJECTIVES));
        }
        builder.append(' ');
        builder.append(RandomLists.randomItemFrom(NOUNS));

        return builder.toString();
    }
}
