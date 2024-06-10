package ru.ancndz;

import java.nio.charset.StandardCharsets;
import org.flywaydb.core.internal.resolver.ChecksumCalculator;
import org.flywaydb.core.internal.resource.filesystem.FileSystemResource;

/**
 * Main class.
 *
 * @author Anton Utkaev
 */
public class Main {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java -jar flyway-checksum-resolver-1.0.jar <file>");
            System.exit(1);
        }

        final FileSystemResource r = new FileSystemResource(null, args[0], StandardCharsets.UTF_8);
        System.out.println("File: " + args[0]);
        System.out.println("Checksum: " + ChecksumCalculator.calculate(r));
    }
}