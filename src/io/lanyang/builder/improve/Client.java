package io.lanyang.builder.improve;

public class Client {
	public static void main(String[] args) {

		//盖普通房子
		CommonHouseBuilder commonHouse = new CommonHouseBuilder();
		//准备创建房子的指挥者
		HouseDirector houseDirector = new HouseDirector(commonHouse);

		//完成盖房子，返回产品(普通房子)
		House house = houseDirector.constructHouse();

		//System.out.println("输出流程");

		System.out.println("--------------------------");
		//盖高楼
		HighBuildingBuilder highBuilding = new HighBuildingBuilder();
		//重置建造者
		houseDirector.setHouseBuilder(highBuilding);
		//完成盖房子，返回产品(高楼)
		houseDirector.constructHouse();

	}
}
