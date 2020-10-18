/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Windows
 * @param <E>
 */
public interface Condition<E> {
    
    boolean include(E e);
}
