package cn.campsg.practical.bubble.entity;


public class MovedStar extends Star{
	private Position MovedPosition = new Position();

	public MovedStar(){
		
	}
	
	public MovedStar(Position oldPosition,StarType type,Position newPosition){
		super(new Position(oldPosition.getRow(),oldPosition.getColumn()),type);
		this.MovedPosition = newPosition;
	}
	
	public Position getMovedPosition() {
		return MovedPosition;
	}

	public void setMovedPosition(Position nPosition) {
		this.MovedPosition = nPosition;
	}
	
	public static void main(String[] args) {
		Position position = new Position(0,0);
		Position position2 = new Position(1,1);
		StarType type = StarType.RED;
		
		MovedStar star = new MovedStar(position,type,position2);
		System.out.println(position + "," + "type" + type + "\n" + star);
	}
	
	@Override
	public String toString() {
		return "new position: (" + MovedPosition.getRow() + "," + MovedPosition.getColumn() + ")";
	}
}
