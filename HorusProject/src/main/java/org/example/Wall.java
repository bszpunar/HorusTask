package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Wall implements Structure{

    private List<Block> blocks;


    public Wall(List<Block> blocks){
        this.blocks = blocks;
    }

    @Override
    public String getColor() {
        return null;
    }

    @Override
    public String getMaterial() {
        return null;
    }

    @Override
    public Optional<Block> findBlockByColor(String color) {
        //method returns first block which was founded
        return blocks.stream().filter(block -> block.getColor().equals(color)).findFirst();
    }

    @Override
    public List<Block> findBlocksByMaterial(String material) {
        return blocks.stream().filter(block -> block.getMaterial().equals(material)).collect(Collectors.toList());
    }

    @Override
    public int count() {
        return blocks.size();
    }

    @Override
    public List<Block> getBlocks() {
        return blocks;
    }
}
