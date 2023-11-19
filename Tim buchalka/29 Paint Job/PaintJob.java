public class PaintJob {
    // write code here
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        
        if(width <= 0) return -1;
        if(height <= 0) return -1;
        if(areaPerBucket <= 0) return -1;
        if(extraBuckets < 0) return -1;
        
        return (int)Math.ceil((width * height) / areaPerBucket  - extraBuckets); 
        
    }

    public static int getBucketCount(double width, double height, double areaPerBucket){
        
        if(width <= 0) return -1;
        if(height <= 0) return -1;
        if(areaPerBucket <= 0) return -1;
        
        return (int)Math.ceil((width * height) / areaPerBucket); 
        
    }

    public static int getBucketCount(double area, double areaPerBucket){
        
        if(areaPerBucket <= 0) return -1;
        if(area <= 0) return -1;
        
        return (int)Math.ceil( area / areaPerBucket); 
        
    }



    public static void main(String[] args) {
        System.out.println(getBucketCount(3.26, 0.75)); 
    }
}