import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class main {


        private static Stream<LogRecord> loadLogs(String logMessage) {
            return Stream.of(new LogRecord(Level.INFO, logMessage));
        }

        public static void main(String[] args) {
            Stream<LogRecord> logs = loadLogs("QA");

            List<String> collect = logs.filter(l -> Level.SEVERE.equals(l.getLevel()))
                    .map(l -> l.getMessage())
                    .collect(Collectors.toList());

            collect.forEach(System.out::println);
        }

}
