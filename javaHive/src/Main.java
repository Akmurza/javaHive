import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello bees!");//через два shift открывается меню поиска, и например туда вводишь breakpoints
        // и тебе отражаются точками все брейкпоинты, в дебаггере либо new watch либо evaluate и там можно посмотреть
        // и РЕАЛИЗОВАТЬ ЛЮБОЙ КОД НА ДАННОМ ЭТАПЕ И ПОСМОТРЕТЬ любое значение чему равняется в этой точке.
        //создаем деревья(два вида деревьев, через класс (HoneyPlant) медовое дерево), то есть создаем два объекта класса
        // HoneyPlant.
        HoneyPlant appleTree = new HoneyPlant(30);
        HoneyPlant plumTree = new HoneyPlant(40);
        //теперь эти созданные деревья(объекты класса) добавляем в коллекцию, через .add, в итоге у нас в коллекции
        // два объекта класса.
        List<HoneyPlant> honeyPlants = new ArrayList<>();
        honeyPlants.add(appleTree);
        honeyPlants.add(plumTree);
        //теперь создаем улей с семью пчелами
        BeeHive beeHive = new BeeHive(7);
        //Супер. Теперь собираем нектар через цикл. Для объекта класса Bee(пчела) под названием bee мы используем метод
        // fetchNectar и в нем в этом методе принимаемое значение медовое дерево.
        for (Bee bee : beeHive.getBees()) {
            bee.fetchNectar(honeyPlants);
        }
        //дальше следует метод уже улья - получить мед из нектара пчел
        beeHive.populateHoney();
        //отображаем результат
        System.out.println(
                beeHive.getHoney() + "мед был спродуцирован" +
                        beeHive.getBees().size() + "пчелы из" + honeyPlants.size() + "honey plants"
        );
    }
}



