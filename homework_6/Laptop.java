package homework_6;

public class Laptop {

        int id; //id ноутбука
        int hardDisk; //объем жесткого диска 
        int RAM; //ОЗУ 
        int cores; //количество ядер
        int diagonal; //диагональ
        int price; //цена

        String model; //модель
        String operatingSystem; //операционная система 
        String processor; //процессор 
        String display; //технология экрана
        String corps; //корпус
        String color; //цвет

        double height; //высота
        double width; //ширина
        double depth; //глубина
        double weight; //вес 
        

    public Laptop(int id, int hardDisk, int RAM, int cores, int diagonal, int price,  
                    String model, String operatingSystem, String processor, 
                    String display, String corps, String color, double height, 
                    double width, double depth, double weight) {
        this.id = id;
        this.hardDisk = hardDisk;
        this.RAM = RAM;
        this.cores = cores;
        this.diagonal = diagonal;
        this.price = price;
        this.model = model; 
        this.operatingSystem = operatingSystem; 
        this.processor = processor; 
        this.display = display; 
        this.corps = corps; 
        this.color = color; 
        this.height = height; 
        this.width = width; 
        this.depth = depth; 
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "id=" + id +
                ", hardDisk=" + hardDisk +
                ", RAM=" + RAM +
                ", cores=" + cores +
                ", diagonal=" + diagonal +
                ", price=" + price +
                ", model='" + model + '\'' +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", processor='" + processor + '\'' +
                ", display='" + display + '\'' +
                ", corps='" + corps + '\'' +
                ", color='" + color + '\'' +
                ", height=" + height +
                ", width=" + width + 
                ", depth=" + depth +
                ", weight=" + weight +
                '}';
    }

    public boolean filteringCriteria(Integer key, String filter) {
        switch (key) {
            case 1 -> { //OЗУ
                return this.RAM >= Integer.parseInt(filter);
            }
            case 2 -> { //Объем RAM
                return this.hardDisk >= Integer.parseInt(filter);
            }
            case 3 -> { //Операционная система
                return this.operatingSystem.toLowerCase().contains(filter.toLowerCase());
            }
            case 4 -> { //Цвет
                return this.color.toLowerCase().contains(filter.toLowerCase());
            }
            case 5 -> { //Диагональ
                return this.diagonal >= Integer.parseInt(filter);
            }
            case 6 -> { //Количество ядер
                return this.cores >= Integer.parseInt(filter);
            }
            case 7 -> { //Вес
                return this.weight >= Double.parseDouble(filter);
            }
            case 8 -> { //Цена
                return this.price >= Integer.parseInt(filter);
            }

        }
        return false;
    }
}
