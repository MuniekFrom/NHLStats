
public class Player {
    String name;
    String club;
    int points;
    int goals;
    int assists;
    int penalties;

    Player(String name, String club, int points, int goals, int assists, int penalties){
        this.name = name;
        this.club = club;
        this.points = points;
        this.goals = goals;
        this.assists = assists;
        this.penalties = penalties;
    }

    public String ShowPoints(){
        if (this.name.length() >= 16 ){
            return this.name + "\t" + this.club + "\t\t\tP:" + this.points;
        } else if (this.name.length() >= 12){
            return this.name + "\t\t" + this.club + "\t\t\tP:" + this.points;
        }
        else if (this.name.length() >= 9){
            return this.name + "\t\t\t" + this.club + "\t\t\tP:" + this.points;
        }
         return "Small name xd";
    }

    public String ShowGoals(){
        if (this.name.length() >= 16 ){
            return this.name + "\t" + this.club + "\t\t\tG:" + this.goals;
        } else if (this.name.length() >= 12){
            return this.name + "\t\t" + this.club + "\t\t\tG:" + this.goals;
        }
        else if (this.name.length() >= 9){
            return this.name + "\t\t\t" + this.club + "\t\t\tG:" + this.goals;
        }
        return "Small name xd";
    }

    public String ShowAssists(){
        if (this.name.length() >= 16 ){
            return this.name + "\t" + this.club + "\t\t\tA:" + this.assists;
        } else if (this.name.length() >= 12){
            return this.name + "\t\t" + this.club + "\t\t\tA:" + this.assists;
        }
        else if (this.name.length() >= 9){
            return this.name + "\t\t\t" + this.club + "\t\t\tA:" + this.assists;
        }
        return "Small name xd";
    }

    public String ShowPenalties(){
        if (this.name.length() >= 16 ){
            return this.name + "\t" + this.club + "\t\t\tP:" + this.penalties;
        } else if (this.name.length() >= 12){
            return this.name + "\t\t" + this.club + "\t\t\tP:" + this.penalties;
        }
        else if (this.name.length() >= 9){
            return this.name + "\t\t\t" + this.club + "\t\t\tP:" + this.penalties;
        }
        return "Small name xd";
    }

    public String PlayerStats(){
        return this.name + "\t\t" + this.club + "\tP:" + this.points + "\tG:" + this.goals + "\tA:" + this.assists + "\tP:" + this.penalties;
    }


}
