class RideSharingSystem {
      List<Integer>l1;
      List<Integer>l2;
    public RideSharingSystem() {
      l1=new ArrayList<>();
       l2=new ArrayList<>();
    }
    
    public void addRider(int riderId) {
        l1.add(riderId);
    }
    
    public void addDriver(int driverId) {
        l2.add(driverId);

    }
    
    public int[] matchDriverWithRider() {
        if(!l1.isEmpty() && !l2.isEmpty()){
            int a=l1.remove(0);
            int b=l2.remove(0);
            return new int[]{b,a};
            
        }
        else{
            return new int[]{-1,-1};
        }
    }
    
    public void cancelRider(int riderId) {
       
        if(l1.contains(riderId)){
            l1.remove(Integer.valueOf(riderId));
        }}
    }


/**
 * Your RideSharingSystem object will be instantiated and called as such:
 * RideSharingSystem obj = new RideSharingSystem();
 * obj.addRider(riderId);
 * obj.addDriver(driverId);
 * int[] param_3 = obj.matchDriverWithRider();
 * obj.cancelRider(riderId);
 */