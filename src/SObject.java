

/**
 * @author Zored
 */
 
 public interface SObject {
    public String getName();
    public void setName(String s);
    public Shape getCollisionModel();
    public void setCollisionModel(Shape s);
    public Vector getPosition();
    public void setPosition(Vector v);
    public Renderer getRenderer();
    public void setRenderer(Renderer r);
 
 }
