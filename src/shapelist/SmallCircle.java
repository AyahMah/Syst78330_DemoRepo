/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package shapelist;

/**
 *
 * @author Ayah Mahmoud
 */
public class SmallCircle {

    private int radius;
    
    public SmallCircle() {
        this.radius = 4;
    }
    
    public SmallCircle(int radius) {
        this.radius = radius;
    }

    /**
     * @return radius of circle
     */
    public int getRadius() {
        return radius;
    }

    /**
     * @param radius set
     */
    public void setRadius(int radius) {
        this.radius = radius;
    }
}
