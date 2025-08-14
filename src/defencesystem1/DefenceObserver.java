/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package defencesystem1;

/**
 *
 * @author DELL
 */
public interface DefenceObserver {
    void updateAreaStatus(boolean isCleared);
    void notifyObservers(int Level);
}
