package presenter;

import models.Animal;

import java.util.ArrayList;
import java.util.Collection;


public interface View {
    void showAnimals(Collection<Animal> var1);
    void setObserver(ViewObserver var1);

}