public class Tiger extends Mammal
	{
		public Tiger()
			{
				name = "Tiger";
				food = "Moose";
			}

		public void showThreat()
			{
				System.out.println("The " + name + " threatens by showing its teeth.");
			}

		public void sleepTime()
			{
				System.out.println("The " + name
						+ " likes to sleep during the day and is active at night, meaning it is nocturnal.");
			}

	}