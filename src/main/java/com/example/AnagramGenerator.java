package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.IntStream;

/**
 * Classe utilitária para geração de anagramas a partir de letras distintas.
 */
public final class AnagramGenerator {

    private AnagramGenerator() {}

    /**
     * Gera todos os anagramas possíveis de uma string com letras distintas.
     *
     * @param input Texto contendo apenas letras (ex: "abc")
     * @return Lista com todas as permutações possíveis
     * @throws IllegalArgumentException se a entrada for inválida
     */
    public static List<String> generateAnagrams(String input) {
        Objects.requireNonNull(input, "A entrada não pode ser nula.");

        var cleanedInput = input.trim();

        if (cleanedInput.isEmpty()) {
            throw new IllegalArgumentException("A entrada não pode estar vazia.");
        }

        if (!cleanedInput.chars().allMatch(Character::isLetter)) {
            throw new IllegalArgumentException("A entrada deve conter apenas letras.");
        }

        var result = new ArrayList<String>();
        var chars = cleanedInput.toCharArray();
        var used = new boolean[chars.length];

        generate("", chars, used, result);

        return result;
    }

    // Backtracking com lambdas e String concatenation
    private static void generate(String current, char[] chars, boolean[] used, List<String> result) {
        if (current.length() == chars.length) {
            result.add(current);
            return;
        }

        IntStream.range(0, chars.length)
                .filter(i -> !used[i])
                .forEach(i -> {
                    used[i] = true;
                    generate(current + chars[i], chars, used, result);
                    used[i] = false;
                });
    }
}
