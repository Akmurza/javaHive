import java.util.List;

class Bee{
    private double nectarCapacity;
    private double maxNectarCapacity=20;
    public void fetchNectar(HoneyPlant honeyPlant){
        double fetchCountPerTime = 1.0;
        while (nectarCapacity>maxNectarCapacity){
            double retrievedNectar=honeyPlant.retrieveNectar(fetchCountPerTime);
            if(retrievedNectar==0){
                return;
            }
            nectarCapacity+=retrievedNectar;
        }
    }
    public double fetchNectar(List<HoneyPlant> honeyPlants){
        for(HoneyPlant honeyPlant: honeyPlants){
            fetchNectar(honeyPlant);
        }
    }

    public double giveNectar;{};

}

