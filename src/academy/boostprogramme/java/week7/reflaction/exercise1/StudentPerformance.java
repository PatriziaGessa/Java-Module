package academy.boostprogramme.java.week7.reflaction.exercise1;

import java.util.Objects;

public class StudentPerformance {

    private String gender;
    private String parentEducation;
    private int mathScore;
    private int readingScore;
    private int writingScore;

    public StudentPerformance(String gender, String parentEducation, int mathScore, int readingScore, int writingScore) {
        this.gender = gender;
        this.parentEducation = parentEducation;
        this.mathScore = mathScore;
        this.readingScore = readingScore;
        this.writingScore = writingScore;
    }

    public String getGender() {
        return gender;
    }

    public String getParentEducation() {
        return parentEducation;
    }

    public int getMathScore() {
        return mathScore;
    }

    public int getReadingScore() {
        return readingScore;
    }

    public int getWritingScore() {
        return writingScore;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentPerformance that = (StudentPerformance) o;
        return mathScore == that.mathScore &&
                readingScore == that.readingScore &&
                writingScore == that.writingScore &&
                Objects.equals(gender, that.gender) &&
                Objects.equals(parentEducation, that.parentEducation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gender, parentEducation, mathScore, readingScore, writingScore);
    }
}
