package cs131.pa2.CarsTunnels;

import cs131.pa2.Abstract.Tunnel;
import cs131.pa2.Abstract.Vehicle;

public class BasicTunnel extends Tunnel{

	public BasicTunnel(String name) {
		super(name);
	}

	@Override
	public boolean tryToEnterInner(Vehicle vehicle) {
		return false;
	}

	@Override
	public void exitTunnelInner(Vehicle vehicle) {
		
	}
	
}
