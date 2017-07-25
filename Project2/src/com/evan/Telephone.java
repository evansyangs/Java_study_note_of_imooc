package com.evan;

public class Telephone {
	private float screen;
	private float cpu;
	private float mem;
	
	public void sendMessage() {
		System.out.println("sendMessage");
	}
	
	public float getCpu() {
		return cpu;
	}

	public void setCpu(float cpu) {
		this.cpu = cpu;
	}

	public float getMem() {
		return mem;
	}

	public void setMem(float mem) {
		this.mem = mem;
	}

	public float getScreen() {
		return screen;
	}
	
	public void setScreen(float screen) {
		this.screen = screen;
		this.sendMessage();
	}
	
	public Telephone() {
		System.out.println("com.evan.Telephone 无参的构造方法执行了");
	}
	public Telephone(float newscreen,float newcpu,float newmem) {
		if(newscreen < 3.5f){
			System.out.println("你输入的参数有问题，自动赋值3.5f");
			screen = 3.5f;
		}
		else {
			screen = newscreen;			
		}
		cpu = newcpu;
		mem = newmem;
		System.out.println("带参的构造方法执行了");
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(cpu);
		result = prime * result + Float.floatToIntBits(mem);
		result = prime * result + Float.floatToIntBits(screen);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Telephone other = (Telephone) obj;
		if (Float.floatToIntBits(cpu) != Float.floatToIntBits(other.cpu))
			return false;
		if (Float.floatToIntBits(mem) != Float.floatToIntBits(other.mem))
			return false;
		if (Float.floatToIntBits(screen) != Float.floatToIntBits(other.screen))
			return false;
		return true;
	}
	
}
