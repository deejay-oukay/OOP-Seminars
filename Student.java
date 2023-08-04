public class Student extends User implements Comparable<Student>, Printable<Student> {
    double meanBall;

    public Student(String firstName, String lastName, int id, double meanBall) {
        super(firstName, lastName, id);
        this.meanBall = meanBall;
    }

    public double getMeanBall() {
        return meanBall;
    }

    public void setMeanBall(double meanBall) {
        this.meanBall = meanBall;
    }

    @Override
    public int compareTo(Student o) {
        if (this.getMeanBall() == o.getMeanBall())
            return 0;
        if (this.getMeanBall() < o.getMeanBall())
            return -1;
        return 1;
    }

    @Override
    public void print() {
        System.out.println(super.toString() + ", meanBall=" + meanBall + "\n");
    }
}
