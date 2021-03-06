package utils;

public final class Constants {

    // the time, in seconds, of a single loop of the robot code
    public static final double LOOP_TIME = 0.02;

    // the height of the target
    public static final double TARGET_HEIGHT = 0.0;

    // the mounting angle of the limelight
    public static final double LIMELIGHT_MOUNTING_ANGLE = Calc.degreesToRadians(0.0);

    // the height of the limelight
    public static final double LIMELIGHT_HEIGHT = 0.0;

    // the amount of encoder clicks per rotation in a Talon SRX encoder
    public static final int TALON_CLICKS = 4096;

    // the amount of encoder clicks per rotation in a Falcon 500 (Talon FX) encoder
    public static final int FALCON_CLICKS = 2048;

    // the diameter of the drive wheels
    public static final double DRIVE_WHEEL_DIAMETER = 0.0;

    // the circumfrence of the drive wheels
    public static final double DRIVE_WHEEL_CIRCUMFRENCE = Math.PI * DRIVE_WHEEL_DIAMETER;

    // this robot has two gear ratios, one for high speed, one for low
    // this is for high speed
    public static final double DRIVE_GEAR_RATIO = 1.0 / 4.4;

    // this distance between the centers of the wheels on opposite sides of the robot, in inches
    public static final double ROBOT_WHEEL_SPACING = 0.0;

    // the circumfrence of the circle formed by rotating the robot a full rotation in place
    public static final double ROBOT_WHEEL_CIRCLE_CIRCUMFRENCE = Math.PI * ROBOT_WHEEL_SPACING;

    public static final String[] COLORS = {"Yellow","Red","Green","Blue"};

    // Numeric values for colors are in the RGB color system
    private static final double[][] COLOR_AVERAGES = {

        {144.05, 255.0, 76.2}, // Yellow
        {249.76, 204.99, 92.36}, // Red
        {80.62, 255.0, 120.94}, // Green
        {75.03, 242.8, 253.3} // Blue
        
    };

    // Numeric values for colors are in the RGB color system
    private static final double[][] COLOR_STANDARD_DEVIATIONS = {

        {3.66, 2.0, 19.54}, // Yellow
        {17.29, 27.46, 21.65}, // Red
        {5.37, 2.0, 3.41}, // Green
        {7.86, 8.04, 5.24} // Blue

    };

    public enum Color{

        Yellow(COLOR_AVERAGES[0], COLOR_STANDARD_DEVIATIONS[0]), 
        Red(COLOR_AVERAGES[1], COLOR_STANDARD_DEVIATIONS[1]), 
        Green(COLOR_AVERAGES[2], COLOR_STANDARD_DEVIATIONS[2]), 
        Blue(COLOR_AVERAGES[3], COLOR_STANDARD_DEVIATIONS[3]);

        public final double RMAX;
        public final double RMIN;

        public final double GMAX;
        public final double GMIN;

        public final double BMAX;
        public final double BMIN;
    
        Color(double averages[], double[] standardDeviations){
    
            RMAX = averages[0] + (2 * standardDeviations[0]);
            RMIN = averages[0] - (2 * standardDeviations[0]);

            GMAX = averages[1] + (2 * standardDeviations[1]);
            GMIN = averages[1] - (2 * standardDeviations[1]);

            BMAX = averages[2] + (2 * standardDeviations[2]);
            BMIN = averages[2] - (2 * standardDeviations[2]);
    
        }
    
    } 

}