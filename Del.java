public class Del{
	private static void jalan(String s){
		java.io.File f=new java.io.File(s+"build");
		if(f.isDirectory())hirarci(f);
		else f.delete();
	}

	private static void hirarci(java.io.File d){
		for(java.io.File f:d.listFiles()){
			if(f.isDirectory())hirarci(f);
			else f.delete();
		}d.delete();
	}

    public static void main(String[]args){
        jobo();
        glass();
        mobile();
        pbm();
        tv();
        wear();
    }

    private static void jobo(){
    	new Thread(new Runnable(){
    		public void run(){
    			jalan("");
    		}
    	}).start();
    }

    private static void glass(){
    	new Thread(new Runnable(){
    		public void run(){
    			jalan("glass/");
    		}
    	}).start();
    }

    private static void mobile(){
    	new Thread(new Runnable(){
    		public void run(){
    			jalan("mobile/");
    		}
    	}).start();
    }

    private static void pbm(){
    	new Thread(new Runnable(){
    		public void run(){
    			jalan("pbm/");
    		}
    	}).start();
    }

    private static void tv(){
    	new Thread(new Runnable(){
    		public void run(){
    			jalan("tv/");
    		}
    	}).start();
    }

    private static void wear(){
    	new Thread(new Runnable(){
    		public void run(){
    			jalan("wear/");
    		}
    	}).start();
    }
}