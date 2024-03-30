package ru.iaie.reflex.generator.r2c.interfaces;

@SuppressWarnings("all")
public interface IFileGenerator {
  void prepareForGeneration();

  void generateVariableDefinitions();

  void generateConstantDefinitions();

  void generateProcessDefinitions();

  void generateProcessImplementations();

  void generateIOFiles();

  void generatePlatformImplementations();

  void generateMain();

  void generateBuildFiles();
}
