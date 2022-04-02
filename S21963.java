package gamers;

import main.Pair;
import main.Unit;

public class S21963 extends Unit {
    public S21963(final String id, final Pair<Double, Double> position, final double r,
                  final CollisionModel model) {
        super(id, position, r, model);

    }

    @Override
    public void run() {
        this.enableStopOnWall();
        this.enableMovement();

        //this.rotateRight();
        this.forward();
        this.rotateBy(180);


        while (true) {
            if (whatIsInRange() == 3)
                this.attackInNextMove();
        }
       /* if (whatIsInRange() == 3) {
            this.attackInNextMove();
        } */
    }
    }

