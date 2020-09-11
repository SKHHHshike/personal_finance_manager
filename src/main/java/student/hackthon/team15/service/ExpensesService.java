package student.hackthon.team15.service;

import student.hackthon.team15.entity.CategoriesEntity;
import student.hackthon.team15.entity.ExpensesEntity;

import java.util.List;

public interface ExpensesService {
    public List<ExpensesEntity> getAllExpenses();
    public void addItemsToCategory();
    public Boolean IfCategoriesContainsId(int id);
    public void modifyItemInCategories(CategoriesEntity item);
    public void deleteItemInCategories(int id);
}
