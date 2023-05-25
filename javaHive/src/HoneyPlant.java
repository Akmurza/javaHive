import java.util.ArrayList;
import java.util.List;

class HoneyPlant {
    private Double nectarCapacity;
    public HoneyPlant (double nectarCapacity){
        this.nectarCapacity=nectarCapacity;}
    //Здесь мы инициализировали переменную вместимостьНектара, создали функцию и приняли ее как аргумент.
    // this здесь является ссылкой на текущий объект, он позволяет обратиться к членам(полям, методам, вложениям
    // текущего объекта(то есть nectarCapacity) в целом эта команда используется для разрешения конфликта одинаковых имен.
    public double retrieveNectar(double nectar){
        List<Bee>bees=new ArrayList<Bee>();
        bees.add(new Bee());
        if(nectar==0)
            return 0;
        nectarCapacity-=nectar;
        if (nectarCapacity<0) {
            throw new RuntimeException("there is not enough nectar in the flower");
            // эта команда создает явно
            // исключительную ситуацию, и выкидывает эти исключения.
        }
        return nectar;
    }
}
