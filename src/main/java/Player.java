public class Player {
    private String name;
    private String email;
    private boolean white;
    private int rank;
    private int age;

    public Player(String name, String email, boolean white, int rank, int age) {
        if(name == null || name.isBlank() || name.isEmpty()){
            throw new IllegalArgumentException("The name should not be empty");
        }
        else {
            this.name = name;
        }
        this.name = name;
        if(email == null || email.isEmpty() || email.isBlank()){
            throw new IllegalArgumentException("The email should not be empty");
        }
        if(!email.contains("@") || !email.contains(".")){
            throw new IllegalArgumentException("Invalid email");
        } else {
            this.email = email;
        }
        this.email = email;

        this.white = white;
        this.rank = rank;
        this.age = age;

    }

    public String getName() {
        return name;
    }
    public String getEmail(){
        return email;
    }
    public boolean isWhite(){
        return white;
    }
    public int getRank(){
        return rank;
    }
    public int getAge(){
        return age;
    }

    public void setRank(int rank){
        if (rank< 100 || rank > 3000){
            throw new IllegalArgumentException("The rank should be in range of 100 and 3000");
        }
        this.rank = rank;
    }

    public void movePiece(Piece piece, Spot spot){
        piece.setSpot(spot);
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", white=" + white +
                ", rank=" + rank +
                ", age=" + age +
                '}';
    }
}
