package oop_encapsulation;


	public class Browser {
		public void launchBrowser() {
		System.out.println("launch browser");
		
		checkBrowserVersion();
		checkBrowserOSCompitability();
		checkRamSpace();
		System.out.println("browser is launched");
		}
		private void checkBrowserVersion() {
			System.out.println("checking browser version");
			
		}
		private void checkBrowserOSCompitability() {
			System.out.println("checking os compitability");
		}
		private void checkRamSpace() {
			System.out.println("checking ram space");
		}
		}


