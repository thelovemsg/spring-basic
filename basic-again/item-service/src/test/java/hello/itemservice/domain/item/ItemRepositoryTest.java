package hello.itemservice.domain.item;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ItemRepositoryTest {

    ItemRepository itemRepository = new ItemRepository();

    @AfterEach
    void afterEach() {
        itemRepository.clearStore();
    }

    @Test
    public void save() throws Exception{
        //given
        Item item = new Item("itemA", 1000, 10);

        //when
        Item savedItem = itemRepository.save(item);

        //then
        Item findItem = itemRepository.findById(item.getId());
        Assertions.assertThat(findItem).isEqualTo(savedItem);
    }

    @Test
    public void findAll() throws Exception{
        //given
        Item item1 = new Item("itemA", 10000, 10);
        Item item2 = new Item("itemB", 12000, 20);

        //when
        itemRepository.save(item1);
        itemRepository.save(item2);
        List<Item> result = itemRepository.findAll();

        //then
        Assertions.assertThat(result.size()).isEqualTo(2);
        Assertions.assertThat(result).contains(item1, item2);


    }

    @Test
    public void updateItem() throws Exception{
        //given
        Item item1 = new Item("itemA", 10000, 10);

        Item savedItem = itemRepository.save(item1);
        Long id = savedItem.getId();

        //when
        Item updateParam = new Item("test", 20000, 30);
        itemRepository.update(item1.getId(), updateParam);

        //then
        Item findItem = itemRepository.findById(id);

        Assertions.assertThat(findItem.getItemName()).isEqualTo(updateParam.getItemName());
        Assertions.assertThat(findItem.getPrice()).isEqualTo(updateParam.getPrice());
        Assertions.assertThat(findItem.getQuantity()).isEqualTo(updateParam.getQuantity());

    }
}