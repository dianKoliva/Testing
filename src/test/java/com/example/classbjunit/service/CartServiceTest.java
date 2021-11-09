package com.example.classbjunit.service;

import com.example.classbjunit.model.Cart;
import com.example.classbjunit.model.Item;
import com.example.classbjunit.repository.CartRepo;
import com.example.classbjunit.service.exception.CartException;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

//@RunWith(MockitoJUnitRunner.class)
@ExtendWith(MockitoExtension.class)
public class CartServiceTest {

    @Mock
    private CartRepo cartRepo;
    private  CartService cartService;

    @Test
   public void canCreateCart(){

        Cart cart=new Cart(0,0);
        cartService.createCart(cart);
//        ArgumentCaptor<Cart> cartArgumentCaptor=
//               ArgumentCaptor.forClass(Cart.class);
//        verify(cartRepo)
//                .save(cartArgumentCaptor.capture());
//
//                Cart capture= cartArgumentCaptor.getValue();
//        assertThat(capture).isEqualTo(cart);

    }

//    @Test
// void findCart(){
//
//        long cartId=1L;
//        Item item=new Item(1,"sugar",500,5);
//        List<Item> items=new ArrayList<>();
//        items.add(item);
//
//
//        given(cartRepo.existsById(anyLong()))
//                .willReturn(false);
//
//        assertThatThrownBy(()->cartService.addTOCart(cartId,items))
//                .isInstanceOf(CartException.class)
//                .hasMessageContaining("Cart with id " + cartId + " does not exist");
//
//        verify(cartRepo,never()).save(any());
//
//    }
//
//    @Test
// void AddTOCart(){
//
//        long cartId=1L;
//        Item item=new Item(1,"sugar",500,4);
//        Item item2=new Item(2,"water",500,5);
//        List<Item> items=new ArrayList<>();
//        items.add(item);
//        items.add(item2);
//
//
//        cartService.addTOCart(cartId,items);
//
//        ArgumentCaptor<Cart> studentArgumentCaptor=
//                ArgumentCaptor.forClass(Cart.class);
//
//        verify(cartRepo)
//                .save(studentArgumentCaptor.capture());
//
//        Cart capture= studentArgumentCaptor.getValue();
//        assertThat(capture.getIts()).isEqualTo(item);
//
//    }
//
//
//    @Test
//   void delete(){
//        long cartId=1L;
//        int itemId=1;
//
//        cartService.removeFromCart(cartId,itemId);
//        verify(cartRepo,never()).save(any());
//    }


}
