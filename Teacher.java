public class Teacher extends User implements Printable<Teacher> {
    private double rating;
    private String discipline;

    public Teacher(String firstName, String lastName, int id, String discipline, double rating) {
        super(firstName, lastName, id);
        this.rating = rating;
        this.discipline = discipline;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    @Override
    public void print() {
        System.out.println(super.toString() + ", rating=" + rating + ", discipline=" + discipline + "\n");
    }
}
