package hus.oop.lap10.adapter;

public class SquarePegAdapter extends RoundPeg{
    private SquarePeg adapter;
    public SquarePegAdapter(SquarePeg adapter){
        super(0);
        this.adapter = adapter;
    }

    @Override
    public int getRadius() {
        return (int) (this.adapter.getWidth()*Math.sqrt(2));
    }
}
