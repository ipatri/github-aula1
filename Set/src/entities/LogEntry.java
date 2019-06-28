package entities;

import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class LogEntry {
    private String userName;
    private Date logDate;

    public LogEntry(String userName, Date logDate) {
        this.userName = userName;
        this.logDate = logDate;
    }

    private static Set<LogEntry> logEntries = new HashSet<>();

    public static void addLog(LogEntry logEntry) {
        logEntries.add(logEntry);
    }

    public static void users() {
        System.out.println(logEntries.size());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LogEntry logEntry = (LogEntry) o;
        return Objects.equals(userName, logEntry.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName);
    }
}