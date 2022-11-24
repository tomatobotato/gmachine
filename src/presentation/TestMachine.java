package presentation;

import java.util.Date;

import entities.Machine;
import services.MachineService;

public class TestMachine {

	public static void main(String[] args) {
		MachineService aa = new MachineService();

		for (Machine s : aa.selectbet(new Date("2022/11/11"), new Date("2022/11/21"))) {
			System.out.println(s);
		}

	}

}
