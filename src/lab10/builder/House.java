package lab10.builder;

import java.util.ArrayList;

public class House {

	// TODO: write optional and mandatory facilities to have in a house
	private String address;
	private int floors, rooms;
	private boolean heating;
	private int appliances;
	private boolean pool, security;

	// TODO: complete the private constructor
	private House(HouseBuilder builder) {
		this.address = builder.address;
		this.floors = builder.floors;
		this.rooms = builder.rooms;
		this.heating = builder.heating;
		this.appliances = builder.appliances;
		this.pool = builder.pool;
		this.security = builder.security;
	}

	// TODO: generate getters

	public String getAddress() {
		return address;
	}

	public int getFloors() {
		return floors;
	}

	public int getRooms() {
		return rooms;
	}

	public boolean isHeating() {
		return heating;
	}

	public int getAppliances() {
		return appliances;
	}

	public boolean isPool() {
		return pool;
	}

	public boolean isSecurity() {
		return security;
	}


	// TODO: override toString method

	@Override
	public String toString() {
		return "House{" +
				"address='" + address + '\'' +
				", floors=" + floors +
				", rooms=" + rooms +
				", heating=" + heating +
				", appliances=" + appliances +
				", pool=" + pool +
				", security=" + security +
				'}';
	}

	public static class HouseBuilder {
		// TODO: write same facilities
		private String address;
		private int floors, rooms;
		private boolean heating = false;
		private int appliances = 0;
		private boolean pool = false, security = false;

		// TODO: complete the house builder constructor only with the mandatory facilities
		public HouseBuilder(String address, int floors, int rooms) {
			this.address = address;
			this.floors = floors;
			this.rooms = rooms;
		}

		// TODO: add the optional facilities in a builder design
		public HouseBuilder heating(boolean heating) {
			this.heating = heating;
			return this;
		}

		public HouseBuilder appliances(int appliances) {
			this.appliances = appliances;
			return this;
		}

		public HouseBuilder pool(boolean pool) {
			this.pool = pool;
			return this;
		}

		public HouseBuilder security(boolean security) {
			this.security = security;
			return this;
		}

		// TODO: complete the final build method
		public House build() {
			return new House(this); // change this
		}

		// TODO: test functionality in a Main class
	}
}
