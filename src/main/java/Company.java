import java.util.ArrayList;
import java.util.List;

public class Company {
    List<Cleaner> cleaners;

    Company(List<Cleaner> cleaners) {
        this.cleaners = cleaners;
    }

    public List<Cleaner> getCleanersList() {
        return cleaners;
    }

    public void assign(Cleaner cleaner, Location location, Job job) {
        cleaner.setLocation(location);
        cleaner.setJobType(job);
    }


    public List<Job> getJobTypesList() {
        List<Job> jobTypes = new ArrayList<>();
        for (Cleaner cleaner : cleaners) {
            jobTypes.add(cleaner.getJobType());
        }
        return jobTypes;
    }
}
