package com.example.classbjunit.service;

import com.example.classbjunit.model.Cart;
import com.example.classbjunit.model.Item;
import com.example.classbjunit.repository.CartRepo;
import com.example.classbjunit.repository.ItemRepository;
import com.example.classbjunit.service.exception.CartException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class CartService {


    @Autowired
    private CartRepo cartRepo;

    ItemRepository itemRepository;

    public void createCart(Cart cart){
 cartRepo.save(cart);

    }

    public  void addTOCart(Long Id,List <Item> item){
        if(!cartRepo.existsById(Id)) {
            throw new CartException(
                    "Cart with id " + Id + " does not exist");
        }
        else{
         Cart cart=cartRepo.getById(Id);
         cart.setIts(item);
         Item toget=item.get(0);
         Item itemgot=itemRepository.getById(toget.getId());

        int newPrice=itemgot.getTotal()+cart.getTotalPrice();
        cart.setTotalPrice(newPrice);
        cartRepo.save(cart);
        }
    }

 void removeFromCart(Long cartId,int itemId){
        if(!cartRepo.existsById(cartId)) {
            throw new CartException(
                    "Cart with id " + cartId + " does not exist");
        }
        else{
            Cart cart=cartRepo.getById(cartId);

            List <Item> its=cart.getIts();
            List <Item> newOne=new ArrayList<>();

            for (Item on : its) {
                if (on.getId() != itemId) {
                    newOne.add(on);
                }
                else
                {
                    int newPrice=cart.getTotalPrice()-on.getTotal();
                    cart.setTotalPrice(newPrice);
                }
            }
            cart.setIts(newOne);
            cartRepo.save(cart);
        }
    }


    public static void main(String[] args) {
        Cart cart=new Cart(0,0);
        CartService service=new CartService();
        service.createCart(cart);
    }
}
